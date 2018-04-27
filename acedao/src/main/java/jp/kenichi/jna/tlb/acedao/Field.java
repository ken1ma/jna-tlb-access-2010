
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({A1EB89D6-0A9C-4575-A0AE-654A990A454C})</p>
 * <p>interface(_Field)</p>
 */
@ComObject(clsId = "{A1EB89D6-0A9C-4575-A0AE-654A990A454C}")
public interface Field extends IUnknown
    ,_Field
{

}