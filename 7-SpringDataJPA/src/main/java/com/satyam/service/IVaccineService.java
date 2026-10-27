package com.satyam.service;

import com.satyam.view.IResultView;

import java.util.List;

public interface IVaccineService {

    public List<IResultView> fetchByCost(Double cost);
}
