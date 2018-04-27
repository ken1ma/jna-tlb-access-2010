
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({8D4F994C-EBBE-4F8D-BA4B-AE20CD36E72D})</p>
 * <p>interface(_Index)</p>
 */
@ComObject(clsId = "{8D4F994C-EBBE-4F8D-BA4B-AE20CD36E72D}")
public interface Index extends IUnknown
    ,_Index
{

}