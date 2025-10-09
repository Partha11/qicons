package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowDownOnSquareStack: ImageVector
    get() {
        if (_ArrowDownOnSquareStack != null) {
            return _ArrowDownOnSquareStack!!
        }
        _ArrowDownOnSquareStack = ImageVector.Builder(
            name = "Outlined.ArrowDownOnSquareStack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.5f, 7.5f)
                horizontalLineToRelative(-0.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 9.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineToRelative(-0.75f)
                moveToRelative(-6f, 3.75f)
                lineToRelative(3f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -3f)
                moveToRelative(-3f, 3f)
                verticalLineTo(1.5f)
                moveToRelative(6f, 9f)
                horizontalLineToRelative(0.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 2.25f)
                verticalLineToRelative(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, 2.25f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, -2.25f)
                verticalLineToRelative(-0.75f)
            }
        }.build()

        return _ArrowDownOnSquareStack!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownOnSquareStack: ImageVector? = null
