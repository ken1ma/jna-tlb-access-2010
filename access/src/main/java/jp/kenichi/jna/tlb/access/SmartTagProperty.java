
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({6E03AD86-431E-4879-A572-EF0EBA2FA729})</p>
 * <p>interface(_SmartTagProperty)</p>
 */
@ComObject(clsId = "{6E03AD86-431E-4879-A572-EF0EBA2FA729}")
public interface SmartTagProperty extends IUnknown
    ,_SmartTagProperty
{

}