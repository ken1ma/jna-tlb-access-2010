
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({DBC5175E-A8ED-11D3-A0DD-00C04F68712B})</p>
 * <p>interface(_Printer)</p>
 */
@ComObject(clsId = "{DBC5175E-A8ED-11D3-A0DD-00C04F68712B}")
public interface Printer extends IUnknown
    ,_Printer
{

}