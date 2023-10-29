package com.kodlama.io.rentAcar.business.Rules.utilities;

public interface IBrandBusinessRules {

    void ifCheckBrandId(int id) throws Exception;
    void ifCheckBrandName(String name) throws Exception;
}
