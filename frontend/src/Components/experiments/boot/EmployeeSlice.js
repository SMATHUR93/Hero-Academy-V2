import { createSlice } from '@reduxjs/toolkit';

export const employeeSlice = createSlice({
  name: 'employee',
  initialState: {
    value: 0,
  },
  reducers: {
    addEmployee: (state, action) => {
        state.value += action.payload;
    },
  },
});

export const { addEmployee } = employeeSlice.actions;

export const addEmployeeAsync = amount => dispatch => {
  setTimeout(() => {
    dispatch(addEmployee(amount));
  }, 1000);
};

export default employeeSlice.reducer;
