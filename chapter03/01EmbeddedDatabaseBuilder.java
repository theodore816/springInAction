@Bean(destoryMethod="shutdown")
public DataSource dataSource(){
    return new EmbeddedDatabaseBuilder().addScript("classpath:schema.sql")
        .addScript("classpath:test-data.sql")
        .build();
}