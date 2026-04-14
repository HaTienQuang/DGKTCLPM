Title: Viết các test JUnit để phủ tất cả các câu lệnh

Mô tả:
- Thêm các test JUnit đảm bảo mọi câu lệnh trong `NumberCheck.check(int n)` được thực thi ít nhất một lần.
- Cụ thể cần đảm bảo vòng lặp được thực thi và cũng có trường hợp vòng lặp bị bỏ qua, và cả hai nhánh của `if` đều được thực thi.

Tiêu chí nghiệm thu:
- Thêm test cho `n=0` (vòng lặp bị bỏ qua, `sum=0` là chẵn), `n=1` (vòng lặp chạy một lần, `sum=1` là lẻ), `n=2` và `n=3` nếu cần.
- Các test nằm trong `NumberCheckTest.java` và chạy thành công bằng JUnit trên môi trường cục bộ.
