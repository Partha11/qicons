package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.SquaresPlus: ImageVector
    get() {
        if (_SquaresPlus != null) {
            return _SquaresPlus!!
        }
        _SquaresPlus = ImageVector.Builder(
            name = "Outlined.SquaresPlus",
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
                moveTo(13.5f, 16.875f)
                horizontalLineToRelative(3.375f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3.375f)
                moveToRelative(-3.375f, 0f)
                lineTo(16.875f, 13.5f)
                moveToRelative(0f, 3.375f)
                verticalLineToRelative(3.375f)
                moveTo(6f, 10.5f)
                horizontalLineToRelative(2.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                lineTo(10.5f, 6f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                lineTo(6f, 3.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 6f)
                verticalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10.5f)
                close()
                moveTo(6f, 20.25f)
                horizontalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 18f)
                verticalLineToRelative(-2.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                lineTo(6f, 13.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                lineTo(3.75f, 18f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20.25f)
                close()
                moveTo(15.75f, 10.5f)
                lineTo(18f, 10.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                lineTo(20.25f, 6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 3.75f)
                horizontalLineToRelative(-2.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 6f)
                verticalLineToRelative(2.25f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                close()
            }
        }.build()

        return _SquaresPlus!!
    }

@Suppress("ObjectPropertyName")
private var _SquaresPlus: ImageVector? = null
