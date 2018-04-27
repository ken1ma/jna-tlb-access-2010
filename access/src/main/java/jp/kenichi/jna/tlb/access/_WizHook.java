
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({CB9D3171-4728-11D1-8334-006008197CC8})</p>
 */
@ComInterface(iid="{CB9D3171-4728-11D1-8334-006008197CC8}")
public interface _WizHook extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x8bd)</p>
     * <p>vtableId(7)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Key", dispId = 0x8bd)
    void setKey(Integer param0);
            
    /**
     * <p>id(0x8ba)</p>
     * <p>vtableId(8)</p>
     * @param Actid [in] {@code Integer}
     */
    @ComMethod(name = "NameFromActid", dispId = 0x8ba)
    String NameFromActid(Integer Actid);
            
    /**
     * <p>id(0x8bc)</p>
     * <p>vtableId(9)</p>
     * @param Actid [in] {@code Integer}
     */
    @ComMethod(name = "ArgsOfActid", dispId = 0x8bc)
    Integer ArgsOfActid(Integer Actid);
            
    /**
     * <p>id(0x8be)</p>
     * <p>vtableId(10)</p>
     * @param Script [in] {@code String}
     * @param Label [in] {@code String}
     * @param OpenMode [in] {@code Integer}
     * @param Extra [inout] {@code Integer}
     * @param Version [inout] {@code Integer}
     */
    @ComMethod(name = "OpenScript", dispId = 0x8be)
    Integer OpenScript(String Script,
            String Label,
            Integer OpenMode,
            VARIANT Extra,
            VARIANT Version);
            
    /**
     * <p>id(0x8bf)</p>
     * <p>vtableId(11)</p>
     * @param HScr [in] {@code Integer}
     * @param ScriptColumn [in] {@code Integer}
     * @param Value [inout] {@code String}
     */
    @ComMethod(name = "GetScriptString", dispId = 0x8bf)
    Boolean GetScriptString(Integer HScr,
            Integer ScriptColumn,
            VARIANT Value);
            
    /**
     * <p>id(0x8c0)</p>
     * <p>vtableId(12)</p>
     * @param HScr [in] {@code Integer}
     * @param ScriptColumn [in] {@code Integer}
     * @param Value [in] {@code String}
     */
    @ComMethod(name = "SaveScriptString", dispId = 0x8c0)
    Boolean SaveScriptString(Integer HScr,
            Integer ScriptColumn,
            String Value);
            
    /**
     * <p>id(0x8c1)</p>
     * <p>vtableId(13)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "GlobalProcExists", dispId = 0x8c1)
    Boolean GlobalProcExists(String Name);
            
    /**
     * <p>id(0x8c2)</p>
     * <p>vtableId(14)</p>
     * @param Table [in] {@code String}
     * @param Columns [in] {@code String}
     */
    @ComMethod(name = "TableFieldHasUniqueIndex", dispId = 0x8c2)
    Boolean TableFieldHasUniqueIndex(String Table,
            String Columns);
            
    /**
     * <p>id(0x8c3)</p>
     * <p>vtableId(15)</p>
     * @param String [inout] {@code String}
     * @param flags [in] {@code Integer}
     */
    @ComMethod(name = "BracketString", dispId = 0x8c3)
    Boolean BracketString(VARIANT String,
            Integer flags);
            
    /**
     * <p>id(0x8c4)</p>
     * <p>vtableId(16)</p>
     * @param HelpFile [in] {@code String}
     * @param wCmd [in] {@code Integer}
     * @param ContextID [in] {@code Integer}
     */
    @ComMethod(name = "WizHelp", dispId = 0x8c4)
    Boolean WizHelp(String HelpFile,
            Integer wCmd,
            Integer ContextID);
            
    /**
     * <p>id(0x8c5)</p>
     * <p>vtableId(17)</p>
     * @param File [inout] {@code String}
     * @param Cancelled [inout] {@code Boolean}
     */
    @ComMethod(name = "OpenPictureFile", dispId = 0x8c5)
    Boolean OpenPictureFile(VARIANT File,
            VARIANT Cancelled);
            
    /**
     * <p>id(0x8c6)</p>
     * <p>vtableId(18)</p>
     * @param In [in] {@code String}
     * @param Out [inout] {@code String}
     */
    @ComMethod(name = "EnglishPictToLocal", dispId = 0x8c6)
    Boolean EnglishPictToLocal(String In,
            VARIANT Out);
            
    /**
     * <p>id(0x8c7)</p>
     * <p>vtableId(19)</p>
     * @param In [in] {@code String}
     * @param Out [inout] {@code String}
     * @param ParseFlags [in] {@code Integer}
     * @param TranslateFlags [in] {@code Integer}
     */
    @ComMethod(name = "TranslateExpression", dispId = 0x8c7)
    Boolean TranslateExpression(String In,
            VARIANT Out,
            Integer ParseFlags,
            Integer TranslateFlags);
            
    /**
     * <p>id(0x8c8)</p>
     * <p>vtableId(20)</p>
     * @param File [in] {@code String}
     */
    @ComMethod(name = "FileExists", dispId = 0x8c8)
    Boolean FileExists(String File);
            
    /**
     * <p>id(0x8c9)</p>
     * <p>vtableId(21)</p>
     * @param RelativePath [in] {@code String}
     * @param FullPath [inout] {@code String}
     */
    @ComMethod(name = "FullPath", dispId = 0x8c9)
    Short FullPath(String RelativePath,
            VARIANT FullPath);
            
    /**
     * <p>id(0x8ca)</p>
     * <p>vtableId(22)</p>
     * @param Path [in] {@code String}
     * @param Drive [inout] {@code String}
     * @param Dir [inout] {@code String}
     * @param File [inout] {@code String}
     * @param Ext [inout] {@code String}
     */
    @ComMethod(name = "SplitPath", dispId = 0x8ca)
    void SplitPath(String Path,
            VARIANT Drive,
            VARIANT Dir,
            VARIANT File,
            VARIANT Ext);
            
    /**
     * <p>id(0x8cb)</p>
     * <p>vtableId(23)</p>
     * @param FontName [in] {@code String}
     * @param Size [in] {@code Integer}
     * @param Weight [in] {@code Integer}
     * @param Italic [in] {@code Boolean}
     * @param Underline [in] {@code Boolean}
     * @param Cch [in] {@code Integer}
     * @param Caption [in] {@code String}
     * @param MaxWidthCch [in] {@code Integer}
     * @param dx [inout] {@code Integer}
     * @param dy [inout] {@code Integer}
     */
    @ComMethod(name = "TwipsFromFont", dispId = 0x8cb)
    Boolean TwipsFromFont(String FontName,
            Integer Size,
            Integer Weight,
            Boolean Italic,
            Boolean Underline,
            Integer Cch,
            String Caption,
            Integer MaxWidthCch,
            VARIANT dx,
            VARIANT dy);
            
    /**
     * <p>id(0x8cc)</p>
     * <p>vtableId(24)</p>
     * @param RecordSource [in] {@code String}
     */
    @ComMethod(name = "ObjTypOfRecordSource", dispId = 0x8cc)
    Short ObjTypOfRecordSource(String RecordSource);
            
    /**
     * <p>id(0x8cd)</p>
     * <p>vtableId(25)</p>
     * @param Identifier [in] {@code String}
     */
    @ComMethod(name = "IsValidIdent", dispId = 0x8cd)
    Boolean IsValidIdent(String Identifier);
            
    /**
     * <p>id(0x8ce)</p>
     * <p>vtableId(26)</p>
     * @param Array [inout] {@code String}
     */
    @ComMethod(name = "SortStringArray", dispId = 0x8ce)
    void SortStringArray(VARIANT Array);
            
    /**
     * <p>id(0x8cf)</p>
     * <p>vtableId(27)</p>
     * @param Workspace [in] {@code jp.kenichi.jna.tlb.acedao.Workspace}
     * @param Database [in] {@code jp.kenichi.jna.tlb.acedao.Database}
     * @param Table [in] {@code String}
     * @param ReturnDebugInfo [in] {@code Boolean}
     * @param Results [inout] {@code String}
     */
    @ComMethod(name = "AnalyzeTable", dispId = 0x8cf)
    Integer AnalyzeTable(jp.kenichi.jna.tlb.acedao.Workspace Workspace,
            jp.kenichi.jna.tlb.acedao.Database Database,
            String Table,
            Boolean ReturnDebugInfo,
            VARIANT Results);
            
    /**
     * <p>id(0x8d0)</p>
     * <p>vtableId(28)</p>
     * @param Workspace [in] {@code jp.kenichi.jna.tlb.acedao.Workspace}
     * @param Database [in] {@code jp.kenichi.jna.tlb.acedao.Database}
     * @param Query [in] {@code String}
     * @param Results [inout] {@code String}
     */
    @ComMethod(name = "AnalyzeQuery", dispId = 0x8d0)
    Integer AnalyzeQuery(jp.kenichi.jna.tlb.acedao.Workspace Workspace,
            jp.kenichi.jna.tlb.acedao.Database Database,
            String Query,
            VARIANT Results);
            
    /**
     * <p>id(0x8d5)</p>
     * <p>vtableId(29)</p>
     * @param hwndOwner [in] {@code Integer}
     * @param AppName [in] {@code String}
     * @param DlgTitle [in] {@code String}
     * @param OpenTitle [in] {@code String}
     * @param File [inout] {@code String}
     * @param InitialDir [in] {@code String}
     * @param Filter [in] {@code String}
     * @param FilterIndex [in] {@code Integer}
     * @param View [in] {@code Integer}
     * @param flags [in] {@code Integer}
     * @param fOpen [in] {@code Boolean}
     */
    @ComMethod(name = "GetFileName", dispId = 0x8d5)
    Integer GetFileName(Integer hwndOwner,
            String AppName,
            String DlgTitle,
            String OpenTitle,
            VARIANT File,
            String InitialDir,
            String Filter,
            Integer FilterIndex,
            Integer View,
            Integer flags,
            Boolean fOpen);
            
    /**
     * <p>id(0x8d9)</p>
     * <p>vtableId(30)</p>
     * @param DpName [in] {@code String}
     * @param CtlName [in] {@code String}
     * @param Typ [in] {@code Integer}
     * @param Section [in] {@code String}
     * @param SectionType [in] {@code Integer}
     * @param AppletCode [in] {@code String}
     * @param X [in] {@code Integer}
     * @param Y [in] {@code Integer}
     * @param dx [in] {@code Integer}
     * @param dy [in] {@code Integer}
     */
    @ComMethod(name = "CreateDataPageControl", dispId = 0x8d9)
    void CreateDataPageControl(String DpName,
            String CtlName,
            Integer Typ,
            String Section,
            Integer SectionType,
            String AppletCode,
            Integer X,
            Integer Y,
            Integer dx,
            Integer dy);
            
    /**
     * <p>id(0x8e1)</p>
     * <p>vtableId(31)</p>
     * @param fStart [in] {@code Boolean}
     */
    @ComMethod(name = "KnownWizLeaks", dispId = 0x8e1)
    void KnownWizLeaks(Boolean fStart);
            
    /**
     * <p>id(0x8f6)</p>
     * <p>vtableId(32)</p>
     * @param bstrDbName [in] {@code String}
     * @param bstrConnect [in] {@code String}
     * @param bstrPasswd [in] {@code String}
     */
    @ComMethod(name = "SetVbaPassword", dispId = 0x8f6)
    Boolean SetVbaPassword(String bstrDbName,
            String bstrConnect,
            String bstrPasswd);
            
    /**
     * <p>id(0x8f7)</p>
     * <p>vtableId(33)</p>
     */
    @ComMethod(name = "LocalFont", dispId = 0x8f7)
    String LocalFont();
            
    /**
     * <p>id(0x8f8)</p>
     * <p>vtableId(34)</p>
     * @param bstrName [in] {@code String}
     * @param objtyp [in] {@code Short}
     */
    @ComMethod(name = "SaveObject", dispId = 0x8f8)
    void SaveObject(String bstrName,
            Short objtyp);
            
    /**
     * <p>id(0x8fb)</p>
     * <p>vtableId(35)</p>
     */
    @ComMethod(name = "CurrentLangID", dispId = 0x8fb)
    Integer CurrentLangID();
            
    /**
     * <p>id(0x8fc)</p>
     * <p>vtableId(36)</p>
     */
    @ComMethod(name = "KeyboardLangID", dispId = 0x8fc)
    Integer KeyboardLangID();
            
    /**
     * <p>id(0x8fe)</p>
     * <p>vtableId(37)</p>
     */
    @ComMethod(name = "AccessUserDataDir", dispId = 0x8fe)
    String AccessUserDataDir();
            
    /**
     * <p>id(0x8ff)</p>
     * <p>vtableId(38)</p>
     */
    @ComMethod(name = "OfficeAddInDir", dispId = 0x8ff)
    String OfficeAddInDir();
            
    /**
     * <p>id(0x901)</p>
     * <p>vtableId(39)</p>
     * @param DpName [in] {@code String}
     * @param FileToInsert [in] {@code String}
     */
    @ComMethod(name = "EmbedFileOnDataPage", dispId = 0x901)
    String EmbedFileOnDataPage(String DpName,
            String FileToInsert);
            
    /**
     * <p>id(0x902)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "DbcVbProject", dispId = 0x902)
    jp.kenichi.jna.tlb.vbide._VBProject getDbcVbProject();
            
    /**
     * <p>id(0x8f4)</p>
     * <p>vtableId(41)</p>
     * @param fRptToFile [in] {@code Boolean}
     * @param bstrFileOut [in] {@code String}
     */
    @ComMethod(name = "ReportLeaksToFile", dispId = 0x8f4)
    void ReportLeaksToFile(Boolean fRptToFile,
            String bstrFileOut);
            
    /**
     * <p>id(0x8f3)</p>
     * <p>vtableId(42)</p>
     * @param bstrConnectionString [in] {@code String}
     */
    @ComProperty(name = "IsMatchToDbcConnectString", dispId = 0x8f3)
    Boolean getIsMatchToDbcConnectString(String bstrConnectionString);
            
    /**
     * <p>id(0x8ea)</p>
     * <p>vtableId(43)</p>
     * @param bstrFilename [in] {@code String}
     */
    @ComMethod(name = "LoadImexSpecSolution", dispId = 0x8ea)
    void LoadImexSpecSolution(String bstrFilename);
            
    /**
     * <p>id(0x8eb)</p>
     * <p>vtableId(44)</p>
     * @param fBlockKeys [in] {@code Boolean}
     */
    @ComMethod(name = "SetDpBlockKeyInput", dispId = 0x8eb)
    void SetDpBlockKeyInput(Boolean fBlockKeys);
            
    /**
     * <p>id(0x913)</p>
     * <p>vtableId(45)</p>
     * @param Name [inout] {@code String}
     * @param ObjType [inout] {@code AcObjectType}
     * @param Attribs [inout] {@code Integer}
     */
    @ComMethod(name = "FirstDbcDataObject", dispId = 0x913)
    Boolean FirstDbcDataObject(VARIANT Name,
            VARIANT ObjType,
            VARIANT Attribs);
            
    /**
     * <p>id(0x914)</p>
     * <p>vtableId(46)</p>
     */
    @ComMethod(name = "CloseCurrentDatabase", dispId = 0x914)
    Boolean CloseCurrentDatabase();
            
    /**
     * <p>id(0x91a)</p>
     * <p>vtableId(47)</p>
     * @param bstrWhich [in] {@code String}
     */
    @ComMethod(name = "AccessWizFilePath", dispId = 0x91a)
    String AccessWizFilePath(String bstrWhich);
            
    /**
     * <p>id(0x91d)</p>
     * <p>vtableId(48)</p>
     */
    @ComMethod(name = "HideDates", dispId = 0x91d)
    Boolean HideDates();
            
    /**
     * <p>id(0x922)</p>
     * <p>vtableId(49)</p>
     * @param bstrBase [in] {@code String}
     */
    @ComMethod(name = "GetColumns", dispId = 0x922)
    String GetColumns(String bstrBase);
            
    /**
     * <p>id(0x923)</p>
     * <p>vtableId(50)</p>
     * @param bstrExt [in] {@code String}
     * @param bstrFilename [inout] {@code String}
     */
    @ComMethod(name = "GetFileOdso", dispId = 0x923)
    Integer GetFileOdso(String bstrExt,
            VARIANT bstrFilename);
            
    /**
     * <p>id(0x93e)</p>
     * <p>vtableId(51)</p>
     * @param bstrBase [in] {@code String}
     */
    @ComMethod(name = "GetInfoForColumns", dispId = 0x93e)
    String GetInfoForColumns(String bstrBase);
            
    /**
     * <p>id(0x940)</p>
     * <p>vtableId(52)</p>
     * @param hwndOwner [in] {@code Integer}
     * @param AppName [in] {@code String}
     * @param DlgTitle [in] {@code String}
     * @param OpenTitle [in] {@code String}
     * @param File [inout] {@code String}
     * @param InitialDir [in] {@code String}
     * @param Filter [in] {@code String}
     * @param FilterIndex [in] {@code Integer}
     * @param View [in] {@code Integer}
     * @param flags [in] {@code Integer}
     * @param fOpen [in] {@code Boolean}
     * @param fFileSystem [in] {@code Object}
     */
    @ComMethod(name = "GetFileName2", dispId = 0x940)
    Integer GetFileName2(Integer hwndOwner,
            String AppName,
            String DlgTitle,
            String OpenTitle,
            VARIANT File,
            String InitialDir,
            String Filter,
            Integer FilterIndex,
            Integer View,
            Integer flags,
            Boolean fOpen,
            Object fFileSystem);
            
    /**
     * <p>id(0x96b)</p>
     * <p>vtableId(53)</p>
     * @param fBlockKeys [in] {@code Boolean}
     */
    @ComMethod(name = "FGetMSDE", dispId = 0x96b)
    Boolean FGetMSDE(Boolean fBlockKeys);
            
    /**
     * <p>id(0x970)</p>
     * <p>vtableId(54)</p>
     * @param bstrText [in] {@code String}
     * @param bstrCaption [in] {@code String}
     * @param wStyle [in] {@code Integer}
     * @param idHelpID [in] {@code Integer}
     * @param bstrHelpFileName [in] {@code String}
     */
    @ComMethod(name = "WizMsgBox", dispId = 0x970)
    Integer WizMsgBox(String bstrText,
            String bstrCaption,
            Integer wStyle,
            Integer idHelpID,
            String bstrHelpFileName);
            
    /**
     * <p>id(0x971)</p>
     * <p>vtableId(55)</p>
     * @param pbstrUID [inout] {@code String}
     * @param pbstrPwd [inout] {@code String}
     */
    @ComMethod(name = "AdpUIDPwd", dispId = 0x971)
    Boolean AdpUIDPwd(VARIANT pbstrUID,
            VARIANT pbstrPwd);
            
    /**
     * <p>id(0x973)</p>
     * <p>vtableId(56)</p>
     * @param lWhich [in] {@code Integer}
     * @param vValue [in] {@code Object}
     */
    @ComMethod(name = "SetWizGlob", dispId = 0x973)
    void SetWizGlob(Integer lWhich,
            Object vValue);
            
    /**
     * <p>id(0x974)</p>
     * <p>vtableId(57)</p>
     * @param lWhich [in] {@code Integer}
     */
    @ComMethod(name = "GetWizGlob", dispId = 0x974)
    Object GetWizGlob(Integer lWhich);
            
    /**
     * <p>id(0x975)</p>
     * <p>vtableId(58)</p>
     * @param bstrADPName [in] {@code String}
     */
    @ComMethod(name = "WizCopyCmdbars", dispId = 0x975)
    void WizCopyCmdbars(String bstrADPName);
            
    /**
     * <p>id(0x97a)</p>
     * <p>vtableId(59)</p>
     * @param bstrTableName [in] {@code String}
     */
    @ComMethod(name = "GetCurrentView", dispId = 0x97a)
    Integer GetCurrentView(String bstrTableName);
            
    /**
     * <p>id(0x97b)</p>
     * <p>vtableId(60)</p>
     * @param wch [in] {@code Integer}
     */
    @ComMethod(name = "FIsFEWch", dispId = 0x97b)
    Boolean FIsFEWch(Integer wch);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(61)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    /**
     * <p>id(0x992)</p>
     * <p>vtableId(62)</p>
     */
    @ComMethod(name = "GetAccWizRCPath", dispId = 0x992)
    String GetAccWizRCPath();
            
    /**
     * <p>id(0x993)</p>
     * <p>vtableId(63)</p>
     * @param objtyp [in] {@code Short}
     * @param bstrObjName [in] {@code String}
     */
    @ComMethod(name = "FCreateNameMap", dispId = 0x993)
    Boolean FCreateNameMap(Short objtyp,
            String bstrObjName);
            
    /**
     * <p>id(0x99a)</p>
     * <p>vtableId(64)</p>
     */
    @ComMethod(name = "GetAdeRegistryPath", dispId = 0x99a)
    String GetAdeRegistryPath();
            
    /**
     * <p>id(0x99d)</p>
     * <p>vtableId(65)</p>
     * @param bstrSpecXML [in] {@code String}
     */
    @ComMethod(name = "ExecuteTempImexSpec", dispId = 0x99d)
    void ExecuteTempImexSpec(String bstrSpecXML);
            
    /**
     * <p>id(0x99f)</p>
     * <p>vtableId(66)</p>
     */
    @ComMethod(name = "FCacheStatus", dispId = 0x99f)
    Boolean FCacheStatus();
            
    /**
     * <p>id(0x9a0)</p>
     * <p>vtableId(67)</p>
     * @param bstrStatus [in] {@code String}
     */
    @ComMethod(name = "CacheStatus", dispId = 0x9a0)
    void CacheStatus(String bstrStatus);
            
    /**
     * <p>id(0x9a1)</p>
     * <p>vtableId(68)</p>
     * @param bstrSpecName [in] {@code String}
     */
    @ComMethod(name = "SetDefaultSpecName", dispId = 0x9a1)
    void SetDefaultSpecName(String bstrSpecName);
            
    /**
     * <p>id(0x9a2)</p>
     * <p>vtableId(69)</p>
     */
    @ComMethod(name = "GetImexTblName", dispId = 0x9a2)
    String GetImexTblName();
            
    /**
     * <p>id(0x9a3)</p>
     * <p>vtableId(70)</p>
     * @param bstrTableName [in] {@code String}
     * @param bstrPropertyName [in] {@code String}
     * @param fServer [in] {@code Boolean}
     */
    @ComMethod(name = "GetLinkedListProperty", dispId = 0x9a3)
    String GetLinkedListProperty(String bstrTableName,
            String bstrPropertyName,
            Boolean fServer);
            
    /**
     * <p>id(0x9c8)</p>
     * <p>vtableId(71)</p>
     * @param pProperty [in] {@code _AccessProperty}
     * @param OpenMode [in] {@code Integer}
     * @param Extra [inout] {@code Integer}
     * @param Version [inout] {@code Integer}
     */
    @ComMethod(name = "OpenEmScript", dispId = 0x9c8)
    Integer OpenEmScript(_AccessProperty pProperty,
            Integer OpenMode,
            VARIANT Extra,
            VARIANT Version);
            
    /**
     * <p>id(0x9ee)</p>
     * <p>vtableId(72)</p>
     */
    @ComMethod(name = "GetDisabledExtensions", dispId = 0x9ee)
    String GetDisabledExtensions();
            
    /**
     * <p>id(0xa20)</p>
     * <p>vtableId(73)</p>
     * @param bstrObjectName [in] {@code String}
     * @param iobjtyp [in] {@code AcObjectType}
     * @param fTablesAsClient [in] {@code Boolean}
     */
    @ComMethod(name = "GetObjPubOption", dispId = 0xa20)
    Integer GetObjPubOption(String bstrObjectName,
            AcObjectType iobjtyp,
            Boolean fTablesAsClient);
            
    /**
     * <p>id(0xa21)</p>
     * <p>vtableId(74)</p>
     * @param bstrObjectName [in] {@code String}
     */
    @ComMethod(name = "FIsPublishedXasTable", dispId = 0xa21)
    Boolean FIsPublishedXasTable(String bstrObjectName);
            
    /**
     * <p>id(0xa23)</p>
     * <p>vtableId(75)</p>
     */
    @ComMethod(name = "FIsXasDb", dispId = 0xa23)
    Boolean FIsXasDb();
            
    /**
     * <p>id(0xa25)</p>
     * <p>vtableId(76)</p>
     * @param bstrObjectName [in] {@code String}
     * @param iobjtyp [in] {@code AcObjectType}
     */
    @ComMethod(name = "FIsValidXasObjectName", dispId = 0xa25)
    Boolean FIsValidXasObjectName(String bstrObjectName,
            AcObjectType iobjtyp);
            
    
}