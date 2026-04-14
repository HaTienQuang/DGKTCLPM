Title: Viết các test JUnit để phủ tất cả các đường đi

Mô tả:
- Thêm các test JUnit đảm bảo tất cả các đường điều khiển trong `NumberCheck.check(int n)` được thực thi.
- Cụ thể bao gồm các trường hợp: vòng lặp bị bỏ qua, vòng lặp chạy một lần, vòng lặp chạy nhiều lần, và cả hai nhánh của `if`.

Tiêu chí nghiệm thu:
- Các test trong `NumberCheckTest.java` bao gồm `n=0`, `n=1`, `n=2` và `n=3` (hoặc tương đương) để minh họa các đường đi khác nhau.
- Các test tồn tại và chạy thành công bằng JUnit trên môi trường cục bộ.
