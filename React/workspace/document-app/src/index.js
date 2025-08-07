import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import DocumentForm from './component/DocumentForm';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import TiptapEditorTest from './component/TiptapEditorTest';
import LeaveRequestForm from './form/LeaveRequestForm';
import QuillTest from './component/QuillTest';
import CKEditorTest from './component/CKEditorTest';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<DocumentForm />} />
        <Route path='/tiptap' element={<TiptapEditorTest />} />
        <Route path='/quill' element={<QuillTest />} />
        <Route path='/ckeditor' element={<CKEditorTest />} />
      </Routes>
      <Link to='/'>PDF출력</Link>
      <Link to='/tiptap'>tiptap출력</Link>
      <Link to='/quill'>quill출력</Link>
      <Link to='/ckeditor'>ckeditor출력</Link>
    </BrowserRouter>
  </React.StrictMode>
);
console.log('DocumentForm:', DocumentForm);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
