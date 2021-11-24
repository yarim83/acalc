package pl.gov.sw.acalc.basic;

import org.springframework.stereotype.Service;

@Service
public class BasicCalcServiceImpl implements BasicCalcService {

    @Override
    public Integer add(Integer addend1, Integer addend2) {
        return addend1 + addend2;
    }

    @Override
    public Integer subtract(Integer minuend, Integer subtrahend) {
        return null;
    }
}
