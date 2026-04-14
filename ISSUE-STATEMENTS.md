Title: Write JUnit tests to cover all statements

Description:
- Add JUnit tests that ensure every statement in `NumberCheck.check(int n)` is executed at least once.
- Specifically ensure the loop is exercised and skipped, and both branches of the `if` are executed.

Acceptance criteria:
- Add tests for `n=0` (loop skipped, sum=0 even), `n=1` (loop runs once, sum=1 odd), `n=2` and `n=3` as needed.
- Tests are present in `NumberCheckTest.java` and pass locally using a JUnit runner.
