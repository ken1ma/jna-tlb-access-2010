
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({483615A0-74BE-101B-AF4E-00AA003F0F08})</p>
 * <p>source(_FormEvents)</p>
 * <p>interface(_Form2)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{483615A0-74BE-101B-AF4E-00AA003F0F08}")
public interface FormOldV10 extends IUnknown
    ,_Form2
    ,IConnectionPoint
{

}