
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({3B06E959-E47C-11CD-8701-00AA003F0F07})</p>
 * <p>source(DispListBoxEvents)</p>
 * <p>source(_ListBoxEvents)</p>
 * <p>interface(_ListBox)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{3B06E959-E47C-11CD-8701-00AA003F0F07}")
public interface ListBox extends IUnknown
    ,_ListBox
    ,IConnectionPoint
{

}