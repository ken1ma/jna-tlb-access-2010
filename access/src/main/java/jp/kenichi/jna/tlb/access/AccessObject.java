
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({ABE316B1-3FF6-11D1-98BD-006008197D41})</p>
 */
@ComInterface(iid="{ABE316B1-3FF6-11D1-98BD-006008197D41}")
public interface AccessObject extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x82f)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Type", dispId = 0x82f)
    AcObjectType getType();
            
    /**
     * <p>id(0x8d1)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x8d1)
    Integer getAttributes();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    AccessObjectProperties getProperties();
            
    /**
     * <p>id(0x8e4)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsLoaded", dispId = 0x8e4)
    Boolean getIsLoaded();
            
    /**
     * <p>id(0x8d4)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x8d4)
    String getFullName();
            
    /**
     * <p>id(0x8d4)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "FullName", dispId = 0x8d4)
    void setFullName(String param0);
            
    /**
     * <p>id(0x96c)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DateCreated", dispId = 0x96c)
    java.util.Date getDateCreated();
            
    /**
     * <p>id(0x96d)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "DateModified", dispId = 0x96d)
    java.util.Date getDateModified();
            
    /**
     * <p>id(0x96e)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x96e)
    AcCurrentView getCurrentView();
            
    /**
     * <p>id(0x982)</p>
     * <p>vtableId(19)</p>
     * @param ObjectType [in] {@code AcObjectType}
     * @param ObjectName [in] {@code String}
     */
    @ComMethod(name = "IsDependentUpon", dispId = 0x982)
    Boolean IsDependentUpon(AcObjectType ObjectType,
            String ObjectName);
            
    /**
     * <p>id(0x983)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "GetDependencyInfo", dispId = 0x983)
    _DependencyInfo GetDependencyInfo();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(21)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0xa24)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "IsWeb", dispId = 0xa24)
    Boolean getIsWeb();
            
    
}