
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({0D944D89-82BC-43DE-9659-699DD3FBCD72})</p>
 * <p>interface(_SmartTagAction)</p>
 */
@ComObject(clsId = "{0D944D89-82BC-43DE-9659-699DD3FBCD72}")
public interface SmartTagAction extends IUnknown
    ,_SmartTagAction
{

}