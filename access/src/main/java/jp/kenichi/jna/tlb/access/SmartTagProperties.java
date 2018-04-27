
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({4215CC2C-15B5-47A5-9B60-119BD269CB7E})</p>
 * <p>interface(_SmartTagProperties)</p>
 */
@ComObject(clsId = "{4215CC2C-15B5-47A5-9B60-119BD269CB7E}")
public interface SmartTagProperties extends IUnknown
    ,_SmartTagProperties
{

}