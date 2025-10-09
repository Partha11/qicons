package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowTurnDownRight: ImageVector
    get() {
        if (_ArrowTurnDownRight != null) {
            return _ArrowTurnDownRight!!
        }
        _ArrowTurnDownRight = ImageVector.Builder(
            name = "Filled.ArrowTurnDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.74f, 3.749f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineTo(15f)
                horizontalLineToRelative(13.938f)
                lineToRelative(-2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.061f, -1.06f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(2.47f, -2.47f)
                horizontalLineTo(3.738f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineTo(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.751f)
                close()
            }
        }.build()

        return _ArrowTurnDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTurnDownRight: ImageVector? = null
