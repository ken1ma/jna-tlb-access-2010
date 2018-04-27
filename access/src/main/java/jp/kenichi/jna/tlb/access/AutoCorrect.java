
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({4375351E-7052-40DF-B4D3-6095E7F8811B})</p>
 * <p>interface(_AutoCorrect)</p>
 */
@ComObject(clsId = "{4375351E-7052-40DF-B4D3-6095E7F8811B}")
public interface AutoCorrect extends IUnknown
    ,_AutoCorrect
{

}