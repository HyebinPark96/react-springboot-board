package com.example.demo.service;

import com.example.demo.dto.BoardDTO;
import com.example.demo.dto.BoardDTOExceptPwd;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.SearchDTO;
import com.example.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 예외처리 하기
@Service
public class BoardService {

    // 인터페이스 자동주입
    @Autowired
    BoardMapper boardMapper;

    // 글 목록 가져오기 + 게시글 검색 + 정렬
    public ResponseDTO getBoardListWithPagingBySearch(SearchDTO searchDTO) {

        // 응답 객체 생성
        ResponseDTO responseDTO = new ResponseDTO();

        // 파라미터 형식 다르므로 Map에 담아서 보내기
        Map<String, Object> searchMap = new HashMap<String, Object>();
        searchMap.put("search_category", searchDTO.getSearch_category());
        searchMap.put("search_keyword", searchDTO.getSearch_keyword());

        List<BoardDTOExceptPwd> boardDTOExceptPwdList = boardMapper.getBoardListWithPagingBySearch(searchMap);

        if(boardDTOExceptPwdList.size() > 0) {
            // 글 목록 가져오기
            responseDTO.setResult(boardDTOExceptPwdList);
        } else {
            responseDTO.setResult(null);
        }

        // 리스트 페이지 만들기 위한 전체 레코드 개수 가져오기
        // Ex) Long count = 0L;
        int postCnt = boardMapper.getPostCntBySearch(searchMap);
        if(postCnt >  0) {
            responseDTO.setPostCnt(postCnt);
        } else {
            responseDTO.setPostCnt(0);
        }

        return responseDTO;
    }

    // 수정, 삭제 시 비밀번호 확인
    public BoardDTOExceptPwd checkPwd(BoardDTO boardDTO) {
        BoardDTOExceptPwd post = boardMapper.checkPwd(boardDTO);
        if(post == null) { // 일치하지 않는다면
            return null;
        } else { // 일치한다면 커맨드 객체로 post 가져옴
            return post;
        }
    }

    // (비밀번호 미포함) 게시글 읽기
    public BoardDTOExceptPwd readPostExceptPwd (int no) {
        boardMapper.plusViewCnt(no); // 조회수 증가
        return boardMapper.readPostExceptPwd(no);
    }

    // (비밀번호 포함) 게시글 가져오기
    public BoardDTO read(int no){
        return boardMapper.read(no);
    }

    // 파일 다운로드
    public File getFile(@PathVariable int no) {
        String filePath = "C:/demo/src/main/resources/static/upload";
        String saveFileName = boardMapper.getFile(no); // 파일명 + 확장자

        File testFile = new File(filePath + "/" + saveFileName); // 경로 + 파일명 + 확장자
        return testFile;
    }

    // 게시글 등록
    public boolean insertPost(BoardDTO boardDTO) {
        int result = boardMapper.insertPost(boardDTO);

        if(result == 1) { // insert 성공
            return true;
        } else { // insert 실패
            return false;
        }
    }

    // 게시글 수정
    public boolean updatePost(BoardDTO boardDTO) throws Exception {
        int result = boardMapper.updatePost(boardDTO);

        if(result == 1) { // update 성공
            return true;
        } else { // update 실패
            return false;
        }
    }

    // 게시글 삭제
    public boolean deletePost(int no) {
        int result = boardMapper.deletePost(no);

        if(result == 1) { // delete 성공
            return true;
        } else { // delete 실패
            return false;
        }
    }

}
