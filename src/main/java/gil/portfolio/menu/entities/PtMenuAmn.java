package gil.portfolio.menu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "pt_menu_amn")
public class PtMenuAmn {
    @Id
    @Column(name = "MENU_ID", nullable = false, length = 8)
    private String menuId;

    @Column(name = "MENU_LVL", length = 1)
    private String menuLvl;

    @Column(name = "MENU_NM", length = 100)
    private String menuNm;

    @Column(name = "MENU_PATH", length = 100)
    private String menuPath;

    @Column(name = "UP_MENU_ID", length = 8)
    private String upMenuId;

    @Column(name = "SVC_GRPNM", length = 250)
    private String svcGrpnm;

    @Column(name = "FLNM", length = 250)
    private String flnm;

    @Column(name = "FL_KD", length = 15)
    private String flKd;

    @Column(name = "SCRN_MRK_YN", length = 1)
    private String scrnMrkYn;

    @Column(name = "UYN", length = 1)
    private String uyn;

    @Column(name = "BRO_UYN", length = 1)
    private String broUyn;

    @ColumnDefault("'0'")
    @Column(name = "USR_AUTH_DSC", length = 3)
    private String usrAuthDsc;

    @Column(name = "USR_TPC", length = 2)
    private String usrTpc;

    @Column(name = "FSRG_DTM")
    private Instant fsrgDtm;

    @Column(name = "FS_RGM", length = 9)
    private String fsRgm;

    @Column(name = "LSCHG_DTM")
    private Instant lschgDtm;

    @Column(name = "LS_CHGM", length = 9)
    private String lsChgm;

    @ColumnDefault("date_format(current_timestamp(),'%Y%m%d' + '01')")
    @Column(name = "VERSION", length = 10)
    private String version;

    @ColumnDefault("'N'")
    @Column(name = "BL_UYN", length = 1)
    private String blUyn;

    @Column(name = "MENU_GROUP", length = 250)
    private String menuGroup;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuLvl() {
        return menuLvl;
    }

    public void setMenuLvl(String menuLvl) {
        this.menuLvl = menuLvl;
    }

    public String getMenuNm() {
        return menuNm;
    }

    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public String getUpMenuId() {
        return upMenuId;
    }

    public void setUpMenuId(String upMenuId) {
        this.upMenuId = upMenuId;
    }

    public String getSvcGrpnm() {
        return svcGrpnm;
    }

    public void setSvcGrpnm(String svcGrpnm) {
        this.svcGrpnm = svcGrpnm;
    }

    public String getFlnm() {
        return flnm;
    }

    public void setFlnm(String flnm) {
        this.flnm = flnm;
    }

    public String getFlKd() {
        return flKd;
    }

    public void setFlKd(String flKd) {
        this.flKd = flKd;
    }

    public String getScrnMrkYn() {
        return scrnMrkYn;
    }

    public void setScrnMrkYn(String scrnMrkYn) {
        this.scrnMrkYn = scrnMrkYn;
    }

    public String getUyn() {
        return uyn;
    }

    public void setUyn(String uyn) {
        this.uyn = uyn;
    }

    public String getBroUyn() {
        return broUyn;
    }

    public void setBroUyn(String broUyn) {
        this.broUyn = broUyn;
    }

    public String getUsrAuthDsc() {
        return usrAuthDsc;
    }

    public void setUsrAuthDsc(String usrAuthDsc) {
        this.usrAuthDsc = usrAuthDsc;
    }

    public String getUsrTpc() {
        return usrTpc;
    }

    public void setUsrTpc(String usrTpc) {
        this.usrTpc = usrTpc;
    }

    public Instant getFsrgDtm() {
        return fsrgDtm;
    }

    public void setFsrgDtm(Instant fsrgDtm) {
        this.fsrgDtm = fsrgDtm;
    }

    public String getFsRgm() {
        return fsRgm;
    }

    public void setFsRgm(String fsRgm) {
        this.fsRgm = fsRgm;
    }

    public Instant getLschgDtm() {
        return lschgDtm;
    }

    public void setLschgDtm(Instant lschgDtm) {
        this.lschgDtm = lschgDtm;
    }

    public String getLsChgm() {
        return lsChgm;
    }

    public void setLsChgm(String lsChgm) {
        this.lsChgm = lsChgm;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBlUyn() {
        return blUyn;
    }

    public void setBlUyn(String blUyn) {
        this.blUyn = blUyn;
    }

    public String getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(String menuGroup) {
        this.menuGroup = menuGroup;
    }

}