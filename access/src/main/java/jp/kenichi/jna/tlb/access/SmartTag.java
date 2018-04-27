
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({EF1A0B1D-AD6D-48E6-9905-BEE2A5D38DF9})</p>
 * <p>interface(_SmartTag)</p>
 */
@ComObject(clsId = "{EF1A0B1D-AD6D-48E6-9905-BEE2A5D38DF9}")
public interface SmartTag extends IUnknown
    ,_SmartTag
{

}