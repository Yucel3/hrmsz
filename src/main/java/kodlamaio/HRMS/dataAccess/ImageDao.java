package kodlamaio.HRMS.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {

}
