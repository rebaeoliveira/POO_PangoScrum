@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            // Define as regras de autorização
            .antMatchers("/recurso-seguro").hasAnyRole("GERENTE")
            .antMatchers("/outra-recurso-seguro").hasAnyRole("GERENTE", "FUNCIONARIO")
            .anyRequest().authenticated() // Todas as outras solicitações requerem autenticação
            .and()
            .formLogin().loginPage("/login").permitAll() // Configura a página de login e permite o acesso a ela
            .and()
            .logout().permitAll(); // Configura a funcionalidade de logout e permite o acesso a ela
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService) // Configura o serviço personalizado de detalhes do usuário
            .passwordEncoder(passwordEncoder()); // Configura o codificador de senhas
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Define o algoritmo de codificação de senhas
    }
}
