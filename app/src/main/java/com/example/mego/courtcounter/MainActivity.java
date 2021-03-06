                    package com.example.mego.courtcounter;

                    import android.os.Bundle;
                    import android.support.v7.app.AppCompatActivity;
                    import android.view.View;
                    import android.widget.TextView;

                    public class MainActivity extends AppCompatActivity {

                        int scoreTeamA = 0;
                        int scoreTeamB = 0;

                        @Override
                        protected void onCreate(Bundle savedInstanceState) {
                            super.onCreate(savedInstanceState);
                            setContentView(R.layout.activity_main);
                        }

                        /*
                         * Increase the score for Team A by 3 points.
                         */
                        public void threeForA(View v) {
                            scoreTeamA = scoreTeamA + 3;
                            displayForTeamA(scoreTeamA);
                        }

                        /*
                         * Increase the score for Team A by 2 points.
                         */
                        public void twoForA(View v) {
                            scoreTeamA = scoreTeamA + 2;
                            displayForTeamA(scoreTeamA);
                        }

                        /*
                         * Increase the score for Team A by 1 point.
                         */
                        public void oneForA(View v) {
                            scoreTeamA = scoreTeamA + 1;
                            displayForTeamA(scoreTeamA);
                        }

                        /*
                         * Increase the score for Team B by 3 points.
                         */
                        public void threeForB(View v) {
                            scoreTeamB = scoreTeamB + 3;
                            displayForTeamB(scoreTeamB);
                        }

                        /*
                         * Increase the score for Team B by 2 points.
                         */
                        public void twoForB(View v) {
                            scoreTeamB = scoreTeamB + 2;
                            displayForTeamB(scoreTeamB);
                        }

                        /*
                         * Increase the score for Team B by 1 point.
                         */
                        public void oneForB(View v) {
                            scoreTeamB = scoreTeamB + 1;
                            displayForTeamB(scoreTeamB);
                        }

                        /*
                         * Reset score for both teams A and B to 0.
                         */
                        public void reset(View v) {
                            scoreTeamA = 0;
                            scoreTeamB = 0;
                            displayForTeamA(scoreTeamA);
                            displayForTeamB(scoreTeamB);
                        }

                        /*
                         * Displays the given score for Team A.
                         */
                        public void displayForTeamA(int score) {
                            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
                            scoreView.setText(String.valueOf(score));
                        }

                        /*
                         * Displays the given score for Team B.
                         */
                        public void displayForTeamB(int score) {
                            TextView scoreView = (TextView) findViewById(R.id.team_b_score);
                            scoreView.setText(String.valueOf(score));
                        }
                    }
