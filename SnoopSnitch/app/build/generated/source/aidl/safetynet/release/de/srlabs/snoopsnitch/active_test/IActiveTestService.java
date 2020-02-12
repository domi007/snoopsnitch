/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /root/research/snoopsnitch/SnoopSnitch/app/src/main/aidl/de/srlabs/snoopsnitch/active_test/IActiveTestService.aidl
 */
package de.srlabs.snoopsnitch.active_test;
public interface IActiveTestService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements de.srlabs.snoopsnitch.active_test.IActiveTestService
{
private static final java.lang.String DESCRIPTOR = "de.srlabs.snoopsnitch.active_test.IActiveTestService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an de.srlabs.snoopsnitch.active_test.IActiveTestService interface,
 * generating a proxy if needed.
 */
public static de.srlabs.snoopsnitch.active_test.IActiveTestService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof de.srlabs.snoopsnitch.active_test.IActiveTestService))) {
return ((de.srlabs.snoopsnitch.active_test.IActiveTestService)iin);
}
return new de.srlabs.snoopsnitch.active_test.IActiveTestService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
de.srlabs.snoopsnitch.active_test.IActiveTestCallback _arg0;
_arg0 = de.srlabs.snoopsnitch.active_test.IActiveTestCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startTest:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.startTest(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopTest:
{
data.enforceInterface(DESCRIPTOR);
this.stopTest();
reply.writeNoException();
return true;
}
case TRANSACTION_clearResults:
{
data.enforceInterface(DESCRIPTOR);
this.clearResults();
reply.writeNoException();
return true;
}
case TRANSACTION_clearCurrentResults:
{
data.enforceInterface(DESCRIPTOR);
this.clearCurrentResults();
reply.writeNoException();
return true;
}
case TRANSACTION_clearCurrentFails:
{
data.enforceInterface(DESCRIPTOR);
this.clearCurrentFails();
reply.writeNoException();
return true;
}
case TRANSACTION_isTestRunning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTestRunning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setUploadDisabled:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setUploadDisabled(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_applySettings:
{
data.enforceInterface(DESCRIPTOR);
this.applySettings();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements de.srlabs.snoopsnitch.active_test.IActiveTestService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void registerCallback(de.srlabs.snoopsnitch.active_test.IActiveTestCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean startTest(java.lang.String ownNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ownNumber);
mRemote.transact(Stub.TRANSACTION_startTest, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void stopTest() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopTest, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearResults() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearResults, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearCurrentResults() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearCurrentResults, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void clearCurrentFails() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearCurrentFails, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isTestRunning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTestRunning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUploadDisabled(boolean uploadDisabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((uploadDisabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setUploadDisabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void applySettings() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_applySettings, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startTest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stopTest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_clearResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_clearCurrentResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_clearCurrentFails = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isTestRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setUploadDisabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_applySettings = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
public void registerCallback(de.srlabs.snoopsnitch.active_test.IActiveTestCallback callback) throws android.os.RemoteException;
public boolean startTest(java.lang.String ownNumber) throws android.os.RemoteException;
public void stopTest() throws android.os.RemoteException;
public void clearResults() throws android.os.RemoteException;
public void clearCurrentResults() throws android.os.RemoteException;
public void clearCurrentFails() throws android.os.RemoteException;
public boolean isTestRunning() throws android.os.RemoteException;
public void setUploadDisabled(boolean uploadDisabled) throws android.os.RemoteException;
public void applySettings() throws android.os.RemoteException;
}
