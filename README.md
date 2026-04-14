# Lap1 — NumberCheck

Miêu tả ngắn:
- `NumberCheck.check(int n)` tính tổng 1..n rồi trả về `true` nếu tổng là chẵn, `false` nếu lẻ.
- Chương trình gồm ít nhất một vòng lặp và một lệnh rẽ nhánh.

Chạy chương trình (không cần Maven, nếu muốn chỉ chạy `main`):

Windows (PowerShell):

```powershell
javac -d out src/main/java/NumberCheck.java
java -cp out NumberCheck
```

Chạy test với Maven (khuyến nghị):

```bash
mvn test
```

Các file liên quan:
- `src/main/java/NumberCheck.java` — mã nguồn chính
- `src/test/java/NumberCheckTest.java` — test JUnit (bao phủ statements & paths)
- `ISSUE-STATEMENTS.md`, `ISSUE-PATHS.md` — nội dung issue (đã được dịch sang Tiếng Việt)

Ghi chú:
- Đã loại bỏ các file `.class` và bỏ theo dõi file biên dịch.
- Nếu muốn, tôi có thể tạo các GitHub Issues thực tế từ các file `.md` hoặc cấu hình JaCoCo tương thích để sinh báo cáo coverage.
