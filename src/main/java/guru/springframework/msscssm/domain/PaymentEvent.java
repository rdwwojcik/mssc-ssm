package guru.springframework.msscssm.domain;

/**
 * Created by radek on 2023-07-05
 */
public enum PaymentEvent {
    PRE_AUTHORIZE, PRE_AUTH_APPROVED, PRE_AUTH_DECLINED, AUTHORIZE, AUTH_APPROVED, AUTH_DECLINED
}
