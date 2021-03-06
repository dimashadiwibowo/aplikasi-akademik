package id.ac.tazkia.akademik.aplikasiakademik.dao;

import id.ac.tazkia.akademik.aplikasiakademik.entity.StatusRecord;
import id.ac.tazkia.akademik.aplikasiakademik.entity.TahunAkademik;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TahunAkademikDao extends PagingAndSortingRepository<TahunAkademik, String> {
    Page<TahunAkademik> findByStatusNotInOrderByKodeTahunAkademikDesc(StatusRecord status, Pageable page);
    TahunAkademik findByStatus(StatusRecord status);
    Page<TahunAkademik> findByStatusNotInAndNamaTahunAkademikContainingIgnoreCaseOrderByKodeTahunAkademikDesc(StatusRecord status,String search, Pageable page);
}
