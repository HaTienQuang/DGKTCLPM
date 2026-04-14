Title: Viết các test JUnit để phủ tất cả các câu lệnh

Mô tả:
- Thêm các test JUnit để đảm bảo tất cả các câu lệnh trong phương thức NumberCheck.check(int n) được thực thi ít nhất một lần.

Phương thức bao gồm:
- Khởi tạo biến
- Vòng lặp
- Câu lệnh trả về kết quả (return)

Các test cần đảm bảo:
- Vòng lặp được thực thi (ví dụ: n >= 1)
- Vòng lặp bị bỏ qua (ví dụ: n = 0)
- Câu lệnh return được thực thi với cả hai kết quả true và false

Tiêu chí nghiệm thu:
- Có test với các giá trị như n = 0, n = 2 và n = 3 (hoặc tương đương)
- Tất cả các dòng lệnh được thực thi ít nhất một lần
- Các test chạy thành công bằng JUnit
