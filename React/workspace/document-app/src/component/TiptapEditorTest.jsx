import React, { useRef } from 'react'
import { EditorContent, useEditor } from '@tiptap/react'
import StarterKit from '@tiptap/starter-kit'
import {Table, TableRow, TableCell, TableHeader} from '@tiptap/extension-table'
import {TaskList} from '@tiptap/extension-task-list'
import {TaskItem} from '@tiptap/extension-task-item'
import { useReactToPrint } from 'react-to-print'
import { SimpleEditor } from '@/components/tiptap-templates/simple/simple-editor'
const TiptapEditorTest = () =>{
  const printRef = useRef(null);

  const handlePrint = useReactToPrint({
    contentRef: printRef,
  })

  return (
    <>
      <button onClick={handlePrint}>출력하기</button>
      <SimpleEditor ref={printRef}/>
    </>
  );
}
export default TiptapEditorTest;