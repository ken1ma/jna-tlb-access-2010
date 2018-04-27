
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({9212BA71-3E79-11D1-98BD-006008197D41})</p>
 */
@ComInterface(iid="{9212BA71-3E79-11D1-98BD-006008197D41}")
public interface _CurrentProject extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8ab)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "AllForms", dispId = 0x8ab)
    AllForms getAllForms();
            
    /**
     * <p>id(0x8ac)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "AllReports", dispId = 0x8ac)
    AllReports getAllReports();
            
    /**
     * <p>id(0x8ad)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "AllMacros", dispId = 0x8ad)
    AllMacros getAllMacros();
            
    /**
     * <p>id(0x8ae)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "AllModules", dispId = 0x8ae)
    AllModules getAllModules();
            
    /**
     * <p>id(0x8b0)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "AllDataAccessPages", dispId = 0x8b0)
    AllDataAccessPages getAllDataAccessPages();
            
    /**
     * <p>id(0x8df)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ProjectType", dispId = 0x8df)
    AcProjectType getProjectType();
            
    /**
     * <p>id(0x8db)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "BaseConnectionString", dispId = 0x8db)
    String getBaseConnectionString();
            
    /**
     * <p>id(0x8dd)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "IsConnected", dispId = 0x8dd)
    Boolean getIsConnected();
            
    /**
     * <p>id(0x8e0)</p>
     * <p>vtableId(15)</p>
     * @param BaseConnectionString [in, optional] {@code Object}
     * @param UserID [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenConnection", dispId = 0x8e0)
    void OpenConnection(Object BaseConnectionString,
            Object UserID,
            Object Password);
            
    /**
     * <p>id(0x8de)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "CloseConnection", dispId = 0x8de)
    void CloseConnection();
            
    /**
     * <p>id(0x82e)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Name", dispId = 0x82e)
    String getName();
            
    /**
     * <p>id(0x8e3)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Path", dispId = 0x8e3)
    String getPath();
            
    /**
     * <p>id(0x8d4)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "FullName", dispId = 0x8d4)
    String getFullName();
            
    /**
     * <p>id(0x8e2)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "Connection", dispId = 0x8e2)
    jp.kenichi.jna.tlb.adodb.Connection getConnection();
            
    /**
     * <p>id(0x82b)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Properties", dispId = 0x82b)
    AccessObjectProperties getProperties();
            
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x93f)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x93f)
    Boolean getRemovePersonalInformation();
            
    /**
     * <p>id(0x93f)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x93f)
    void setRemovePersonalInformation(Boolean param0);
            
    /**
     * <p>id(0x949)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "FileFormat", dispId = 0x949)
    AcFileFormat getFileFormat();
            
    /**
     * <p>id(0x97c)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "AccessConnection", dispId = 0x97c)
    jp.kenichi.jna.tlb.adodb.Connection getAccessConnection();
            
    /**
     * <p>id(0x98f)</p>
     * <p>vtableId(28)</p>
     */
    @ComMethod(name = "UpdateDependencyInfo", dispId = 0x98f)
    void UpdateDependencyInfo();
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(29)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x996)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "ImportExportSpecifications", dispId = 0x996)
    ImportExportSpecifications getImportExportSpecifications();
            
    /**
     * <p>id(0x9a5)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "IsTrusted", dispId = 0x9a5)
    Boolean getIsTrusted();
            
    /**
     * <p>id(0xa1f)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "WebSite", dispId = 0xa1f)
    String getWebSite();
            
    /**
     * <p>id(0xa23)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "IsWeb", dispId = 0xa23)
    Boolean getIsWeb();
            
    /**
     * <p>id(0xa1d)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "Resources", dispId = 0xa1d)
    SharedResources getResources();
            
    /**
     * <p>id(0xa1e)</p>
     * <p>vtableId(35)</p>
     * @param SharedImageName [in] {@code String}
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "AddSharedImage", dispId = 0xa1e)
    void AddSharedImage(String SharedImageName,
            String FileName);
            
    
}