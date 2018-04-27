
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({CB9D3172-4728-11D1-8334-006008197CC8})</p>
 * <p>interface(_WizHook)</p>
 */
@ComObject(clsId = "{CB9D3172-4728-11D1-8334-006008197CC8}")
public interface WizHook extends IUnknown
    ,_WizHook
{

}