package gil.portfolio.menu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "pt_svc_ent_amn")
public class PtSvcEntAmn {
    @EmbeddedId
    private PtSvcEntAmnId id;

    @Column(name = "FSRG_DTM")
    private LocalDate fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private LocalDate lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    public PtSvcEntAmnId getId() {
        return id;
    }

    public void setId(PtSvcEntAmnId id) {
        this.id = id;
    }

    public LocalDate getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(LocalDate fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsRgm() {
        return fsRgm;
    }

    public void setFsRgm(String fsRgm) {
        this.fsRgm = fsRgm;
    }

    public LocalDate getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(LocalDate lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsChgm() {
        return lsChgm;
    }

    public void setLsChgm(String lsChgm) {
        this.lsChgm = lsChgm;
    }

}