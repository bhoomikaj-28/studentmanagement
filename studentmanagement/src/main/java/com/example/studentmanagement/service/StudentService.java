import java.util.List;


@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;


    // Save Student
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}