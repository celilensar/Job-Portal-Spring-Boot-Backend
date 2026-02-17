package com.celilensar.jobportal.company.service;

import com.celilensar.jobportal.dto.CompanyDto;
import com.celilensar.jobportal.entity.Company;

import java.util.List;

public interface ICompanyService {

    List<CompanyDto> getAllCompanies();
}
