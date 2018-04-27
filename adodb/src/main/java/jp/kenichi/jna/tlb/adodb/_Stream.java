
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00001565-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00001565-0000-0010-8000-00AA006D2EA4}")
public interface _Stream extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Size", dispId = 0x1)
    Integer getSize();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "EOS", dispId = 0x2)
    Boolean getEOS();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Position", dispId = 0x3)
    Integer getPosition();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Position", dispId = 0x3)
    void setPosition(Integer param0);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Type", dispId = 0x4)
    StreamTypeEnum getType();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code StreamTypeEnum}
     */
    @ComProperty(name = "Type", dispId = 0x4)
    void setType(StreamTypeEnum param0);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "LineSeparator", dispId = 0x5)
    LineSeparatorEnum getLineSeparator();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code LineSeparatorEnum}
     */
    @ComProperty(name = "LineSeparator", dispId = 0x5)
    void setLineSeparator(LineSeparatorEnum param0);
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "State", dispId = 0x6)
    ObjectStateEnum getState();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Mode", dispId = 0x7)
    ConnectModeEnum getMode();
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(17)</p>
     * @param param0 [in] {@code ConnectModeEnum}
     */
    @ComProperty(name = "Mode", dispId = 0x7)
    void setMode(ConnectModeEnum param0);
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Charset", dispId = 0x8)
    String getCharset();
            
    /**
     * <p>id(0x8)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Charset", dispId = 0x8)
    void setCharset(String param0);
            
    /**
     * <p>id(0x9)</p>
     * <p>vtableId(20)</p>
     * @param NumBytes [in, optional] {@code Integer}
     */
    @ComMethod(name = "Read", dispId = 0x9)
    Object Read(Integer NumBytes);
            
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(21)</p>
     * @param Source [in, optional] {@code Object}
     * @param Mode [in, optional] {@code ConnectModeEnum}
     * @param Options [in, optional] {@code StreamOpenOptionsEnum}
     * @param UserName [in, optional] {@code String}
     * @param Password [in, optional] {@code String}
     */
    @ComMethod(name = "Open", dispId = 0xa)
    void Open(Object Source,
            ConnectModeEnum Mode,
            StreamOpenOptionsEnum Options,
            String UserName,
            String Password);
            
    /**
     * <p>id(0xb)</p>
     * <p>vtableId(22)</p>
     */
    @ComMethod(name = "Close", dispId = 0xb)
    void Close();
            
    /**
     * <p>id(0xc)</p>
     * <p>vtableId(23)</p>
     */
    @ComMethod(name = "SkipLine", dispId = 0xc)
    void SkipLine();
            
    /**
     * <p>id(0xd)</p>
     * <p>vtableId(24)</p>
     * @param Buffer [in] {@code Object}
     */
    @ComMethod(name = "Write", dispId = 0xd)
    void Write(Object Buffer);
            
    /**
     * <p>id(0xe)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "SetEOS", dispId = 0xe)
    void SetEOS();
            
    /**
     * <p>id(0xf)</p>
     * <p>vtableId(26)</p>
     * @param DestStream [in] {@code _Stream}
     * @param CharNumber [in, optional] {@code Integer}
     */
    @ComMethod(name = "CopyTo", dispId = 0xf)
    void CopyTo(_Stream DestStream,
            Integer CharNumber);
            
    /**
     * <p>id(0x10)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Flush", dispId = 0x10)
    void Flush();
            
    /**
     * <p>id(0x11)</p>
     * <p>vtableId(28)</p>
     * @param FileName [in] {@code String}
     * @param Options [in, optional] {@code SaveOptionsEnum}
     */
    @ComMethod(name = "SaveToFile", dispId = 0x11)
    void SaveToFile(String FileName,
            SaveOptionsEnum Options);
            
    /**
     * <p>id(0x12)</p>
     * <p>vtableId(29)</p>
     * @param FileName [in] {@code String}
     */
    @ComMethod(name = "LoadFromFile", dispId = 0x12)
    void LoadFromFile(String FileName);
            
    /**
     * <p>id(0x13)</p>
     * <p>vtableId(30)</p>
     * @param NumChars [in, optional] {@code Integer}
     */
    @ComMethod(name = "ReadText", dispId = 0x13)
    String ReadText(Integer NumChars);
            
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(31)</p>
     * @param Data [in] {@code String}
     * @param Options [in, optional] {@code StreamWriteEnum}
     */
    @ComMethod(name = "WriteText", dispId = 0x14)
    void WriteText(String Data,
            StreamWriteEnum Options);
            
    /**
     * <p>id(0x15)</p>
     * <p>vtableId(32)</p>
     */
    @ComMethod(name = "Cancel", dispId = 0x15)
    void Cancel();
            
    
}