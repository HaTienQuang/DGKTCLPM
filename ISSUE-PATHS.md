Title: Viết các test JUnit để phủ tất cả các đường đi

Mô tả:
Thêm các test JUnit để đảm bảo tất cả các đường thực thi trong phương thức NumberCheck.check(int n) được bao phủ.

Phương thức bao gồm:
- Một vòng lặp (có thể không chạy hoặc chạy nhiều lần)
- Một biểu thức điều kiện (sum % 2 == 0) với hai kết quả có thể xảy ra (true/false)

Các test cần bao phủ:
- Trường hợp vòng lặp không chạy (ví dụ: n = 0)
- Trường hợp vòng lặp chạy ít nhất một lần (ví dụ: n = 1, 2, 3)
- Cả hai kết quả của biểu thức điều kiện (true và false)

Tiêu chí nghiệm thu:
- Có test với các giá trị như n = 2 (tổng lẻ → false) và n = 3 (tổng chẵn → true)
- Bao phủ tất cả các đường thực thi logic
- Các test chạy thành công bằng JUnit
