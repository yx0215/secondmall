package com.yx.xx.transaction.config;

import org.springframework.context.annotation.Configuration;

/**
 * 支付宝沙箱支付配置类
 */

@Configuration
public class AlipayConfig {

    /**
     * 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
     */
    public static String app_id = "9021000135621210";

    /**
     * 商户私钥，您的PKCS8格式RSA2私钥
     */
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCwVjNpncOw75yFxtyA/FK+r/2F/BL3dEhQoRo48J+POu42ZnaDB6avMMmPjsTPiKCrVzGeXL/FspJFTJH5dJTWvYnVhwntg8+hcEImfQTu8q+lRSv/f2tqGVaQ3E9s0JTaMUvYzeVckOsdR1amziI7L474qznhEhC8VHIDg+mzGeQZW9g60dKR6Xhtj3wYYwpm02gAFtCfBpgJWpgZNgbEWoNyFxT915VaBTcxae3AFH93y6nTq9P3OWykP120PA6N9VJoAkw6EcZiGYALNHYDHdoXOslDyfFdDn1PncGjm61rlXfxnmO4k8lXMCJH777irbLC6YGU1M1vWTxEDisJAgMBAAECggEAf/5x3w3Gx52FDY1k7LM6FHOGIETyN2/ONchaUk5GYx6xXgdNqppZIPzWsT8+GC3iAbyOpZZJFOUjSu3jXyCCEMUPUVBtolt00Ie9XFaOyCqb1+i3oQMKIr81mHxxolhcU2xI05vQCjqejmgDu5wQOMmyi0kt//Ku9ySMhYSwk3DXRDlO+LbXclZmexfoVAPaUCKblg8hG7nctRXvwFoJgbj7Imn3C8JgHhFRvi+xkl1C3ZfpH9/eOwbiy0l1/YQCTbKo8LZP50GNEPD+v5c3LM+CPY40DOf8o27qsgKohLR3dMd5KIn5Wj1wTmpEpjIywhtivxJwsiC0vIsxibS/AQKBgQDtktLbbHHcEP59vxJ7RtUCfOyMXHZjX2gz12SZAFlJnyokw0S3ILqyUKNKh+wDaM+xSUIUUvDisKt0UvaSN75A5mOQsxmeqLj9eLIkSOXUD/z/PYYJVpbBIrNnI4SV6XR69sybTWz425wZYOwnf0y24O3hKYXqDrPbEFieGijJ+QKBgQC+A3sNvIJW3rKOAmqwAn5brA1ZJ5mK+LeQXJyPvZ0sPj4nGwckFsYYEGGtjMztstuvvTrx7TeAy+n5S8h1sEBIUrJ+miqpxU2cahu/2kFWCZvWyXkSDb9QwdKI3pYH0G1qIz/OGbLEzyH4+sLsq7u/uydHmmp4gy7OEj2O18stkQKBgQDHcR0HDDFB2Bptojx3tW0ZW5qR8wWIQw4Nh2NydrJ+ddpBZpSHUDirfbq31QezjQffA2sv+Lk09a/aRdOtyJI1lbQ8Q77cTTSPxgV3JKOctZdlB1dA+6ovlVwa19x0pbodiJcYQZWcDXEsdQuL1PioBohtIBjF93XSEBT1FWzssQKBgH8XnufqLZfjLrTTov6FPHUemHMIjKeqgkU53LI8FnOwUiwf5N/bp7YSxvKpGaznlA9w14tXqmcofR/082jccbKuNZt+jIivYqD7TAI//rGIjcbVTXio300pxyMrFli1rWlvmE7HW45OKR/6wgRBPbwZd0VqYEqpG9ZT1v7DEbAxAoGAcTblPuoYh3uPVqpv97ewfj330P8jbTWCKaj8giHdZgzhNOir+xz8jI1GaYMY938EIdZJ+hbauLnwtgYm5oWKWUO/l8kYXCFGWr0FTiAS6ojGHScVpIeWcE/R31NJ/0V40Qr5uRjLMmIxD28Oq1R9sEtyBGcc8n007hGKI+r30hY=";

    /**
     * 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥
     */
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAm2NJMdJgxOfkRNNUqfrv7SWVglVh0WTi+eshfN/8sk9SWd4plBORT8DmhghP6hk/CPxrcKio+5UNNkPjjeyn4nAMJK/Ar3sNvqs3mrA/HLVVsO2hPcX90/eKHj/cBJf1m7SFQCJZtpIe0LmcSof929B7hc5m8xxz1uuVhrwu/RmyiBXaLxWVxswr+AGOsP3Zb9NXz2n6lBFA9ZRLN3to8YmIz9hTX00gS4BoxB9LAJlCQc7YhMIC9VuVocEqaZQtWwaM19BcwfXA3HkPJ2hic8hzwxCWjDwi6X+VNPYhi07M1lX/UWAhIH572cZaL9o5heYN8uYCdfsQVtdwxhDStwIDAQAB";

    /**
     * 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    //public static String notify_url = "http://z2o7626444.qicp.vip/checkout/returnUrl";

    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String return_url = " http://secondmall.natapp1.cc/checkout/returnUrl";

    /**
     * 签名方式
     */
    public static String sign_type = "RSA2";

    /**
     * 字符编码格式
     */
    public static String charset = "utf-8";

    /**
     * 支付宝网关
     */
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";
}

