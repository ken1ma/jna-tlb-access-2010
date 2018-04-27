
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({331FDD27-CF31-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{331FDD27-CF31-11CD-8701-00AA003F0F07}")
public interface _GroupLevel extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    Properties getProperties();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "ControlSource", dispId = 0x1b)
    String getControlSource();
            
    /**
     * <p>id(0x1b)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ControlSource", dispId = 0x1b)
    void setControlSource(String param0);
            
    /**
     * <p>id(0xae)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SortOrder", dispId = 0xae)
    Boolean getSortOrder();
            
    /**
     * <p>id(0xae)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "SortOrder", dispId = 0xae)
    void setSortOrder(Boolean param0);
            
    /**
     * <p>id(0xaf)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "GroupHeader", dispId = 0xaf)
    Boolean getGroupHeader();
            
    /**
     * <p>id(0xaf)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GroupHeader", dispId = 0xaf)
    void setGroupHeader(Boolean param0);
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "GroupFooter", dispId = 0xb0)
    Boolean getGroupFooter();
            
    /**
     * <p>id(0xb0)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "GroupFooter", dispId = 0xb0)
    void setGroupFooter(Boolean param0);
            
    /**
     * <p>id(0xb1)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "GroupOn", dispId = 0xb1)
    Short getGroupOn();
            
    /**
     * <p>id(0xb1)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "GroupOn", dispId = 0xb1)
    void setGroupOn(Short param0);
            
    /**
     * <p>id(0xb2)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "GroupInterval", dispId = 0xb2)
    Integer getGroupInterval();
            
    /**
     * <p>id(0xb2)</p>
     * <p>vtableId(21)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "GroupInterval", dispId = 0xb2)
    void setGroupInterval(Integer param0);
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "KeepTogether", dispId = 0x4b)
    Byte getKeepTogether();
            
    /**
     * <p>id(0x4b)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Byte}
     */
    @ComProperty(name = "KeepTogether", dispId = 0x4b)
    void setKeepTogether(Byte param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(24)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}