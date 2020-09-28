package com.api.sigaa.app.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" +
            "MIIEowIBAAKCAQEArlNDZ0Lp0jr5JAqkb1zy9JZ+vJ7Eq7sZrNseNwk2swVjh1++\r\n" +
            "p0j2oACpi8c7XchWQbJROKc4veOqPUSQj0bDereLztdQIvLqp+qK8K2F/pTJlXPB\r\n" +
            "pgYNn4SdX46inBD9HFMZ2Sb1Mk3akjbsjlkokYuRdWBhT236W+e2w59toNi8UCRZ\r\n" +
            "CoYBOyRi72lae1IfVKEVmyVusV7yEiZnGhW1E66Vi/ieGIFQrizdBcFrtlVjTFmh\r\n" +
            "KyIYQ/jPBYMn6H9mO6lvqYucQvFueBujAN2cPaujEz+XXyjeyNVBVxp2EPv3kxPM\r\n" +
            "MQuQ1VYBRC/3Akf48reRxkWTp8CWvlhMO8ENswIDAQABAoIBAA1qBM7GXF28Af3e\r\n" +
            "/8Y9/cgKaJg1E2cvj4s4lTug7t+Zs43wNSiEOc4YHvPNkejmiJSnlw5n97rM8QWj\r\n" +
            "6AfOZy5jP1PcR6NY0+u15ZkdkSkE4/onHSicYKH8v2th+2tM910dm+iU0dtcGEyW\r\n" +
            "A1/0xmVkuv2wO+yzxscZrnuhIft1cY0w9A7Mf5ksWE5eTPRl95c5ZjtOBf28ID+v\r\n" +
            "G9vbTUBQiEvhngYKydM82H8aAlr9RBN+IqoyC+mGwHlU7miNH8NtWwZPHBNGHb3m\r\n" +
            "GXgjWqr44uCN0OlaTSXvhN10oR6um15XEPnlW0s86YeAfqe4X0zMK2Pkt/Kzkk2W\r\n" +
            "adOf0bECgYEA00EU9jQSgUTP+cPdgokhg3zuDfugsvtKGJ0C0cpSbTCo4b1jopgL\r\n" +
            "c5fW9aHcw89n8szwy25vdQAvXp6VncJ5Bhbr/qQwbm8SALOtnkqfHdJPVqr2nHfo\r\n" +
            "TmeEBmKH5cw0sKm3CdN0caFm3W6BS7Mhbo8AbIqi6DYY4W2VlJksj7sCgYEA0z/E\r\n" +
            "clVH37f+v6KBRLJVXK7i02cOfXzQeNBKvrx9bMKya1i2sbWEin5q1Pc72CCdLduI\r\n" +
            "ztEEkIEGTe3wJErnI9v9bmXzwR+nIZ8TcBCCrdDb+eT5w/f+StJ8Y6s+uVIKozPC\r\n" +
            "bB7UbzoD6f5+sJPiAki8d1BxYu61t/9ztVlLrmkCgYBqO0QLOsxDbRMYikINrl/H\r\n" +
            "+z7KkUqSNoNgNTSBwrgIaHvEaLR9wu+fRS+3fZnCbb3b/urnobUypNEtR5n9Jxos\r\n" +
            "0cIC3xXrsrbe23vnKacyG9wBvR8eN73+D1f4zfuAt1uXqwB8VHUt3vgXScaDBqU9\r\n" +
            "L3QLIPwiwXFpiu25N/2MmQKBgQCqmkINT+AmxdJ/cz7QevFDU52tuvnR0D4Qg68J\r\n" +
            "kPH+JtKurMuGgyCSNHwUl8IFznkBst0uoVD9XqX3w6P/u1ol9KEcSkvr+KMiHPU2\r\n" +
            "uK7Arv8oNoqbgCkmxgxc9cxHIAGlQcTPSqqnVQQaMkSgWB3bWGCUPywDCONKwIvy\r\n" +
            "tjXPmQKBgDSpZ6pRRyJx+xJMxCMkyOK2I/rT7J22PEMNAfdG34etQYQ3JkWArj2u\r\n" +
            "Ff/zrKQgsTAQdLHCeugnHwNbWsRlTRV/CxO1za+Y5xWg8vzjl3SUSICTMkKLavua\r\n" +
            "Z2At4GeivAK6SgKtByvq0qn2GvGCAb1+qL0iWpExMhU4s7lnWal3\r\n" +
            "-----END RSA PRIVATE KEY-----";
    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArlNDZ0Lp0jr5JAqkb1zy\r\n" +
            "9JZ+vJ7Eq7sZrNseNwk2swVjh1++p0j2oACpi8c7XchWQbJROKc4veOqPUSQj0bD\r\n" +
            "ereLztdQIvLqp+qK8K2F/pTJlXPBpgYNn4SdX46inBD9HFMZ2Sb1Mk3akjbsjlko\r\n" +
            "kYuRdWBhT236W+e2w59toNi8UCRZCoYBOyRi72lae1IfVKEVmyVusV7yEiZnGhW1\r\n" +
            "E66Vi/ieGIFQrizdBcFrtlVjTFmhKyIYQ/jPBYMn6H9mO6lvqYucQvFueBujAN2c\r\n" +
            "PaujEz+XXyjeyNVBVxp2EPv3kxPMMQuQ1VYBRC/3Akf48reRxkWTp8CWvlhMO8EN\r\n" +
            "swIDAQAB\r\n" +
            "-----END PUBLIC KEY-----";
}
