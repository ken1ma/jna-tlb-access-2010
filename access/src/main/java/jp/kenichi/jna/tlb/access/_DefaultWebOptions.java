
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({416ED4F0-AB31-11D1-BF72-0060083E43CF})</p>
 */
@ComInterface(iid="{416ED4F0-AB31-11D1-BF72-0060083E43CF}")
public interface _DefaultWebOptions extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x8e7)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "HyperlinkColor", dispId = 0x8e7)
    AcColorIndex getHyperlinkColor();
            
    /**
     * <p>id(0x8e7)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code AcColorIndex}
     */
    @ComProperty(name = "HyperlinkColor", dispId = 0x8e7)
    void setHyperlinkColor(AcColorIndex param0);
            
    /**
     * <p>id(0x8e8)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "FollowedHyperlinkColor", dispId = 0x8e8)
    AcColorIndex getFollowedHyperlinkColor();
            
    /**
     * <p>id(0x8e8)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code AcColorIndex}
     */
    @ComProperty(name = "FollowedHyperlinkColor", dispId = 0x8e8)
    void setFollowedHyperlinkColor(AcColorIndex param0);
            
    /**
     * <p>id(0x8e9)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "UnderlineHyperlinks", dispId = 0x8e9)
    Boolean getUnderlineHyperlinks();
            
    /**
     * <p>id(0x8e9)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UnderlineHyperlinks", dispId = 0x8e9)
    void setUnderlineHyperlinks(Boolean param0);
            
    /**
     * <p>id(0x8ec)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x8ec)
    Boolean getOrganizeInFolder();
            
    /**
     * <p>id(0x8ec)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "OrganizeInFolder", dispId = 0x8ec)
    void setOrganizeInFolder(Boolean param0);
            
    /**
     * <p>id(0x8ed)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x8ed)
    Boolean getUseLongFileNames();
            
    /**
     * <p>id(0x8ed)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "UseLongFileNames", dispId = 0x8ed)
    void setUseLongFileNames(Boolean param0);
            
    /**
     * <p>id(0x8ee)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "CheckIfOfficeIsHTMLEditor", dispId = 0x8ee)
    Boolean getCheckIfOfficeIsHTMLEditor();
            
    /**
     * <p>id(0x8ee)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "CheckIfOfficeIsHTMLEditor", dispId = 0x8ee)
    void setCheckIfOfficeIsHTMLEditor(Boolean param0);
            
    /**
     * <p>id(0x8ef)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "DownloadComponents", dispId = 0x8ef)
    Boolean getDownloadComponents();
            
    /**
     * <p>id(0x8ef)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DownloadComponents", dispId = 0x8ef)
    void setDownloadComponents(Boolean param0);
            
    /**
     * <p>id(0x8f0)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "LocationOfComponents", dispId = 0x8f0)
    String getLocationOfComponents();
            
    /**
     * <p>id(0x8f0)</p>
     * <p>vtableId(24)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "LocationOfComponents", dispId = 0x8f0)
    void setLocationOfComponents(String param0);
            
    /**
     * <p>id(0x8f1)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "Encoding", dispId = 0x8f1)
    jp.kenichi.jna.tlb.office.MsoEncoding getEncoding();
            
    /**
     * <p>id(0x8f1)</p>
     * <p>vtableId(26)</p>
     * @param param0 [in] {@code jp.kenichi.jna.tlb.office.MsoEncoding}
     */
    @ComProperty(name = "Encoding", dispId = 0x8f1)
    void setEncoding(jp.kenichi.jna.tlb.office.MsoEncoding param0);
            
    /**
     * <p>id(0x8f2)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "AlwaysSaveInDefaultEncoding", dispId = 0x8f2)
    Boolean getAlwaysSaveInDefaultEncoding();
            
    /**
     * <p>id(0x8f2)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "AlwaysSaveInDefaultEncoding", dispId = 0x8f2)
    void setAlwaysSaveInDefaultEncoding(Boolean param0);
            
    /**
     * <p>id(0x903)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "FolderSuffix", dispId = 0x903)
    String getFolderSuffix();
            
    /**
     * <p>id(0x91b)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "TargetBrowser", dispId = 0x91b)
    jp.kenichi.jna.tlb.office.MsoTargetBrowser getTargetBrowser();
            
    /**
     * <p>id(0x91b)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code jp.kenichi.jna.tlb.office.MsoTargetBrowser}
     */
    @ComProperty(name = "TargetBrowser", dispId = 0x91b)
    void setTargetBrowser(jp.kenichi.jna.tlb.office.MsoTargetBrowser param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(32)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}