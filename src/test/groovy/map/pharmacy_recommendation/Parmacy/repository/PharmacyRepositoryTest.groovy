package map.pharmacy_recommendation.pharmacy.repository

import map.pharmacy_recommendation.Pharmacy.entity.Pharmacy
import map.pharmacy_recommendation.Pharmacy.repository.PharmacyRepository
import org.springframework.beans.factory.annotation.Autowired
import map.pharmacy_recommendation.AbstractIntegrationContainerBaseTest

class PharmacyRepositoryTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    PharmacyRepository pharmacyRepository

    def "PharmacyRepository save"(){
        given:
        String address = "서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longitude = 128.11

        def pharmacy = Pharmacy.builder()
                .pharmacyAddress(address)
                .pharmacyName(name)
                .latitude(latitude)
                .longitude(longitude)
                .build()

        when:
        def result = pharmacyRepository.save(pharmacy)


        then:
        result.getPharmacyAddress() == address
        result.getPharmacyName() == name
        result.getLatitude() == latitude
        result.getLongitude() == longitude

    }


}