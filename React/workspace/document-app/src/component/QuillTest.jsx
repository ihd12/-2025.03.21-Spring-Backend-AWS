import Quill from 'quill';
import 'quill/dist/quill.snow.css';
import { useEffect, useRef } from 'react';

function QuillTest() {
    const editorRef = useRef(null);

    useEffect(() => {
        if (editorRef.current && !editorRef.current.__quill) {
            const quill = new Quill(editorRef.current, {
                theme: 'snow',
                modules: {
                    toolbar: [
                        [{ header: [1, 2, 3, false] }],
                        ['bold', 'italic', 'underline'],
                        ['blockquote', 'code-block'],
                        [{ list: 'ordered' }, { list: 'bullet' }],
                        ['link', 'image'],
                        ['clean'],
                    ],
                },
            });

            // 저장 참조용
            editorRef.current.__quill = quill;

            // 값 변경 핸들링
            quill.on('text-change', () => {
                const html = quill.root.innerHTML;
                console.log('Editor content:', html);
            });
        }
    }, []);

    return (
        <div>
            <div ref={editorRef} style={{ height: '300px' }} />
        </div>
    );
}
export default QuillTest;