package isp;

public interface Payment {

    void calculatePayment();
    void creditCardPayment();
    void bankTransferPayment();
    void cashPayment();
}
