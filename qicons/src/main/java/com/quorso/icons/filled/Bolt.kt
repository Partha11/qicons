package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Bolt: ImageVector
    get() {
        if (_Bolt != null) {
            return _Bolt!!
        }
        _Bolt = ImageVector.Builder(
            name = "Filled.Bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.615f, 1.595f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.359f, 0.852f)
                lineTo(12.982f, 9.75f)
                horizontalLineToRelative(7.268f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.548f, 1.262f)
                lineToRelative(-10.5f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.272f, -0.71f)
                lineToRelative(1.992f, -7.302f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.548f, -1.262f)
                lineToRelative(10.5f, -11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.913f, -0.143f)
                close()
            }
        }.build()

        return _Bolt!!
    }

@Suppress("ObjectPropertyName")
private var _Bolt: ImageVector? = null
