# ๐ React + Spring Boot ๊ฒ์ํ ๊ตฌํ  
## ๐จ ๊ฐ๋ฐํ๊ฒฝ
* Java Version 8, Gradle / Spring Boot Version 2.6.7 / React Version 17.0.2
* ์ฌ์ฉ ๋ผ์ด๋ธ๋ฌ๋ฆฌ
  * ํ์ด๋ธ : `material-table 1.69.3`
  * ์ฐจํธ : `amchart4 4.10.22` 
  * ํญ : `material-ui/core 4.12.3`
## โ ๊ธฐ๋ฅ
  * ํญ ๋ฉ๋ด ๊ตฌํ
    * 1๋ฒ ํญ ๊ฒ์ํ, 2๋ฒ ํญ ์ฐจํธ
  * ๊ธ ๋ฆฌ์คํธ
    * ๊ธ ๋ฒํธ, ์ ๋ชฉ, ์์ฑ์, ์์ฑ ์ผ์
    * ์ปฌ๋ผ๋ณ ์ ๋ ฌ
  * [Modal] ๊ธ ๋ฑ๋ก
    * ์๋ ฅ ํญ๋ชฉ : ์์ฑ์๋ช, ๋น๋ฐ๋ฒํธ, ์ ๋ชฉ, ๋ด์ฉ
  * [Modal] ๊ธ ์์ 
    * ๋น๋ฐ๋ฒํธ ํ์ธ ํ ์์  Modal Open
  * [Modal] ๊ธ ์ญ์ 
    * ๋น๋ฐ๋ฒํธ ํ์ธ ํ ์ญ์  Modal Open
        * ์ญ์  ์  ์ฌ์ฉ์ ์ต์ข ํ์ธ Modal ํ์
  * Pagination ๊ตฌํ
  * ๊ธ ๋ฑ๋ก, ์์  ์ ์ฒจ๋ถ ํ์ผ ์ถ๊ฐ ๊ธฐ๋ฅ
    * ์ฒจ๋ถ ํ์ผ ์กด์ฌ ์ ๊ธ ๋ฆฌ์คํธ์์ ์์ด์ฝ ํ์
  * ์กฐํ์ ํ์
  * ๊ฒ์๊ธ ๊ฒ์ ๊ธฐ๋ฅ
  * ์ฐจํธ
    * ์ปฌ๋ผ์ฐจํธ : ์ผ์๋ณ ๊ฒ์๊ธ ์
  * ํ์๊ธฐ๋ฅ
    * ํ์๊ฐ์
    * ๋ก๊ทธ์ธ
    * sessionStorage๋ก ์ธ์ ์ฐ๋ ๊ธฐ๋ฅ ๊ตฌํ
## โ ํผ๋๋ฐฑ
  * @ControllerAdvice๋ฅผ ์ด์ฉํ ์์ธ์ฒ๋ฆฌ
  * ๋ง์ด๋ฐํฐ์ค ์ฌ๋ฌ if๋ฌธ๋ณด๋ค choose when๋ฌธ์ผ๋ก ์ฝ๋ ์ค์ด๊ธฐ
  * ํ์ด์ง ์ฒ๋ฆฌ : ๋คํธ์ํฌ preview/response๋ฅผ ์ฐธ๊ณ ํ์ฌ ํ์ด์ง๋น ์ ์ฒด ๊ฒ์๊ธ์ ๋ถ๋ฌ์ค๋ ๋ฐฉ์์์ 
                  ํ์ด์ง๋น ๊ฒ์๊ธ ๊ฐ์๋งํผ๋ง ๋ค๊ณ ์ค๊ธฐ
  * ๋ฌด๋ถ๋ณํ console.log() ๋์  ๊ฐ๋ฐ์๋๊ตฌ๋ฅผ ์ด์ฉํ ๋๋ฒ๊น
  * ์ปดํฌ๋ํธ ๋ถ๋ฆฌ ๋ฐ props๋ก state ๋๊ฒจ์ฃผ๊ธฐ
  * state๋ ์ํ๊ด๋ฆฌ๋ฅผ ์ํด ํ์ํ ๊ฒ์ด๋ฏ๋ก ์ผํ์ฑ ์ฉ๋๋ ๋ณ์๋ก ๊ด๋ฆฌ
  * ๊ฐ๊ธ์  useRef ์ง์
  * ๊ตฌ์กฐ๋ถํดํ ๋น(spread ๋ฑ) ํ์ต
