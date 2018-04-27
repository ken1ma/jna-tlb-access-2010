
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({DBC51761-A8ED-11D3-A0DD-00C04F68712B})</p>
 * <p>interface(_AdditionalData)</p>
 */
@ComObject(clsId = "{DBC51761-A8ED-11D3-A0DD-00C04F68712B}")
public interface AdditionalData extends IUnknown
    ,_AdditionalData
{

}