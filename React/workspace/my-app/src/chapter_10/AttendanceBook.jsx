const studenets = [
    {id:1,name:"Inje",},
    {id:2,name:"Steve",},
    {id:3,name:"Bill",},
    {id:4,name:"Jeff",},
];
function AttendanceBook(props){
    return(
        <ul>
        {
            studenets.map(
                (student)=>
                    {return <li key={student.id}>{student.name}</li>}
            )
        }
        </ul>
    )
}
export default AttendanceBook;