public interface MessageEncoder {
    void encode();
    void decode();
    void encode(String plainText);
    void decode(String cipherText);
}
