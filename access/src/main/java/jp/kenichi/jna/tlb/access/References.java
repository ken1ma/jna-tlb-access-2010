
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({EB106214-9C89-11CF-A2B3-00A0C90542FF})</p>
 * <p>source(_References_Events)</p>
 * <p>interface(_References)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{EB106214-9C89-11CF-A2B3-00A0C90542FF}")
public interface References extends IUnknown
    ,_References
    ,IConnectionPoint
{

}